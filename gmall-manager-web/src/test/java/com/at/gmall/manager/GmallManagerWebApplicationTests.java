package com.at.gmall.manager;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerWebApplicationTests {


    @Test
    public void contextLoads() throws IOException, MyException {
        System.out.println("0000");

        String file = this.getClass().getResource("/tracker.conf").getFile();
        ClientGlobal.init(file);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getTrackerServer();
        StorageClient storageClient = new StorageClient(trackerServer,null);

        String[] jpgs = storageClient.upload_file("C:\\Users\\wen\\Pictures\\Snipaste_2020-06-04_00-13-24.jpg", "jpg", null);
        for (String jpg : jpgs) {
            System.out.println(jpg);
        }

        System.out.println("---------------上传完成");

    }

}
