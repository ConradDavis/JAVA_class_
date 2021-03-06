package project;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
/**
 * 实时写入和读取指定文件的内容
 * Created by lgq on 2015/6/3.
 */
public class LogView {
 
    private long lastTimeFileSize = 0;
 
    /**
     * 实时读取指定文件的内容
     * @param logFile
     * @throws FileNotFoundException
     */
    public void realtimeShowLog(File logFile) throws FileNotFoundException {
        //指定文件可读可写
        final RandomAccessFile randomAccessFile = new RandomAccessFile(logFile, "rw");
        //启动一个线程每10秒钟读取新增的日志信息
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    //获得变化部分的
                    randomAccessFile.seek(lastTimeFileSize);
                    String tmp = "";
                    while ( (tmp = randomAccessFile.readLine()) != null) {
                        // 输出文件内容
                        System.out.println(new String(tmp.getBytes("ISO8859-1")));
                        lastTimeFileSize = randomAccessFile.length();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 10, TimeUnit.SECONDS);
 
    }
 
 
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String msgInfo = "this is a message";
 
    /**
     * 实时写入日志到指定文件
     * @throws IOException
     */
    public void writerLog() throws IOException {
        final File logFile = new File("C:/Users/hp/Desktop/max.txt");
        if(!logFile.exists()) {
            logFile.createNewFile();
        }
        //启动一个线程每2秒钟向日志文件写一次数据
        ScheduledExecutorService exec =  Executors.newScheduledThreadPool(1);
        exec.scheduleWithFixedDelay(new Runnable(){
            public void run() {
                try {
                    if(logFile == null) {
                        throw new IllegalStateException("logFile can not be null!");
                    }
                    Writer txtWriter = new FileWriter(logFile,true);
                    txtWriter.write(dateFormat.format(new Date()) +"\t"+ msgInfo +"\n");
                    txtWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
 
 
    public static void main(String[] args) throws Exception {
        LogView view = new LogView();
        view.writerLog();
        final File tmpLogFile = new File("C:/Users/hp/Desktop/max.txt");
        view.realtimeShowLog(tmpLogFile);
    }
 
}