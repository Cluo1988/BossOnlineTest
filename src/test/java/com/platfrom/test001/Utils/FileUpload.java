package com.platfrom.test001.Utils;

/**
 * Created by Administrator on 8/10/2019.
 */

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

import java.io.File;

/**
 * Created by Administrator on 2019/8/10.
 */
public class FileUpload {
    public void FileUpload(String title,String classNameNN,String filePath,String id){
        File file =new File("lib","jacob-1.19-x64.dll");
        System.setProperty(LibraryLoader.JACOB_DLL_PATH,file.getAbsolutePath());

        AutoItX x = new AutoItX();

        x.winActivate(title);
        x.winWaitActive(title);
        x.controlSend(title,"",classNameNN,filePath);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        x.controlClick(title,"",id);

    }


}
