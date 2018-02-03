package org.aibo.action;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

/**
 * Created by Squirrel-Chen on 2018/2/2.
 */
@Controller
public class FileUploadController {

    @RequestMapping(value="/fileUpload",method = RequestMethod.POST)
    @ResponseBody
    public Object fileUpload(@RequestParam MultipartFile[] uploadfiles, HttpServletRequest request, HttpServletResponse response) throws IOException{

        System.out.println("收到用户["  + "]的文件上传请求");
        String realPath = "E://picture";
        String str=new String();

        boolean flag=false;
        int size=uploadfiles.length;
        int count=0;

        //上传文件的原名(即上传前的文件名字)
        String originalFilename = null;

        for(MultipartFile myfile : uploadfiles){
            if(myfile.isEmpty()){

            }else{
                originalFilename = myfile.getOriginalFilename();
                System.out.println("文件原名: " + originalFilename);
                System.out.println("文件名称: " + myfile.getName());
                System.out.println("文件长度: " + myfile.getSize());
                System.out.println("文件类型: " + myfile.getContentType());
                System.out.println("========================================");
                try {
                    //此处也可以使用Spring提供的MultipartFile.transferTo(File dest)方法实现文件的上传
                    FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, originalFilename));
                    String string="{'status':'true'}";
                    count=count+1;
                } catch (IOException e) {
                    System.out.println("文件[" + originalFilename + "]上传失败,堆栈轨迹如下");
                    e.printStackTrace();
                    String string="{'status':'false'}";
                }
            }
        }

        if(count!=0)
        {
            str="{'flag':'true'}";
            return JSON.parse(str);
        }
        str="{'flag':'false'}";
        return JSON.parse(str);
    }

}
