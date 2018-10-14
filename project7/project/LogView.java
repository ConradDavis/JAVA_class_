package project;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
/**
 * ʵʱд��Ͷ�ȡָ���ļ�������
 * Created by lgq on 2015/6/3.
 */
public class LogView {
 
    private long lastTimeFileSize = 0;
 
    /**
     * ʵʱ��ȡָ���ļ�������
     * @param logFile
     * @throws FileNotFoundException
     */
    public void realtimeShowLog(File logFile) throws FileNotFoundException {
        //ָ���ļ��ɶ���д
        final RandomAccessFile randomAccessFile = new RandomAccessFile(logFile, "rw");
        //����һ���߳�ÿ10���Ӷ�ȡ��������־��Ϣ
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    //��ñ仯���ֵ�
                    randomAccessFile.seek(lastTimeFileSize);
                    String tmp = "";
                    while ( (tmp = randomAccessFile.readLine()) != null) {
                        // ����ļ�����
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
     * ʵʱд����־��ָ���ļ�
     * @throws IOException
     */
    public void writerLog() throws IOException {
        final File logFile = new File("C:/Users/hp/Desktop/max.txt");
        if(!logFile.exists()) {
            logFile.createNewFile();
        }
        //����һ���߳�ÿ2��������־�ļ�дһ������
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