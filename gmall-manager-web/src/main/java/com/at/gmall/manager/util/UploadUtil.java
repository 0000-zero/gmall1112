package com.at.gmall.manager.util;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author zero
 * @create 2020-11-15 20:34
 */
public class UploadUtil {

    public String uploadImages(MultipartFile file) {

        String url = "http://192.168.44.105";


        try {
            ClientGlobal.init(this.getClass().getResource("/tracker.conf").getFile());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }

        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getTrackerServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StorageClient storageClient = new StorageClient(trackerServer,null);



        try {
            byte[] bytes = file.getBytes();
            String substring = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);

            String[] jpgs = storageClient.upload_file(bytes, substring, null);

            for (String jpg : jpgs) {
                url+="/"+jpg;
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println("图片路径 ： " + url);

        return url;
    }

}
