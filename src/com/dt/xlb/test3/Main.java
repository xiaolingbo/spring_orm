package com.dt.xlb.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lb.xiao on 2018/7/30.
 */
public class Main {
    private static final String FILE_NAME = "sample.xml";
    private Package pack;

    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public void saveSimpleBean() throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(FILE_NAME);
            this.marshaller.marshal(pack, new StreamResult(os));
        } finally {
            if (os != null) {
                os.close();
            }
        }
    }

    public void loadSimpleBean() throws IOException {
        FileInputStream is = null;
        try {
            is = new FileInputStream(FILE_NAME);
            this.pack = (Package) this.unmarshaller.unmarshal(new StreamSource(is));
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring-config.xml");
        Main ex = (Main) ct.getBean("oxmExample");
        ex.go();
    }

    private void go() throws IOException {
        pack = new Package();
        //saveSimpleBean();
        loadSimpleBean();
        System.out.println("name: " + pack.getEnvelopInfo());

    }


    private Package getSimpleBean() {
        Package pack = new Package();
//        pack.setAge(40);
//        //pack.setExecutive(false);
//        pack.setJobDescription("这是张三的描述");
//        pack.setName("张三");

        return pack;

    }
}
