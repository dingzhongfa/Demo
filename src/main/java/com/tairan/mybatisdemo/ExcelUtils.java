package com.tairan.mybatisdemo;

import com.tairan.mybatisdemo.model.User;
import com.tairan.mybatisdemo.model.bill_transfer_guarantee;
import com.tairan.mybatisdemo.service.UserService;
import com.tairan.mybatisdemo.service.impl.UserServiceImpl;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by hzdzf on 2016/12/6.
 */
public class ExcelUtils {


    public static void export(List<bill_transfer_guarantee> list) throws Exception
    {
        // 第一步，创建一个webbook，对应一个Excel文件

        XSSFWorkbook wb = new XSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        XSSFSheet sheet = wb.createSheet("用户表一");

        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        XSSFRow row = sheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        XSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

        XSSFCell cell = row.createCell((short) 0);
        cell.setCellValue("学号");
        cell.setCellStyle(style);
        cell = row.createCell((short) 1);
        cell.setCellValue("姓名");
        cell.setCellStyle(style);
        cell = row.createCell((short) 2);
        cell.setCellValue("密码");
        cell.setCellStyle(style);
        cell = row.createCell((short) 3);
        cell.setCellValue("年龄");
        cell.setCellStyle(style);

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，

        for (int i = 0; i < list.size(); i++)
        {
            row = sheet.createRow((int) i + 1);
            bill_transfer_guarantee bill = (bill_transfer_guarantee) list.get(i);
            // 第四步，创建单元格，并设置值
//    private String id;
            row.createCell((short) 0).setCellValue( bill.getId());
//    private String billnumber;
            row.createCell((short) 1).setCellValue( bill.getBillnumber());
//    private String channelid;
            row.createCell((short) 2).setCellValue( bill.getChannelid());
//    private String channelaccount;
            row.createCell((short) 3).setCellValue( bill.getChannelaccount());
//    private String transfertype;
            row.createCell((short) 4).setCellValue(bill.getTransfertype());
//    private String fromuserid;
            row.createCell((short) 5).setCellValue( bill.getFromuserid());
//    private String fromaccountid;
            row.createCell((short) 6).setCellValue( bill.getFromaccountid());
//    private String touserid;
            row.createCell((short) 7).setCellValue( bill.getTouserid());
//    private String toaccountid;
            row.createCell((short) 8).setCellValue( bill.getToaccountid());
//    private String tothirduserid;
            row.createCell((short) 9).setCellValue( bill.getTothirduserid());
//    private String tothirdaccountid;
            row.createCell((short) 10).setCellValue( bill.getTothirdaccountid());
//    private String businessnumber;
            row.createCell((short) 11).setCellValue( bill.getBusinessnumber());
//    private String batchid;
            row.createCell((short) 12).setCellValue( bill.getBatchid());
//    private String businessbody;
            row.createCell((short) 13).setCellValue( bill.getBusinessbody());
//    private String appid;
            row.createCell((short) 14).setCellValue( bill.getAppid());
//    private Date businessdate;
            row.createCell((short) 15).setCellValue( bill.getBusinessdate());
//    private String businessdesc;
            row.createCell((short) 16).setCellValue( bill.getBusinessdesc());
//    private BigDecimal amount;
            row.createCell((short) 17).setCellValue(String.valueOf(bill.getAmount()));
//    private String sign;
            row.createCell((short) 18).setCellValue( bill.getSign());
//    private Date invaliddate;
            row.createCell((short) 19).setCellValue( bill.getInvaliddate());
//    private Date createdate;
            row.createCell((short) 20).setCellValue( bill.getCreatedate());
//    private Date updatedate;
            row.createCell((short) 21).setCellValue( bill.getUpdatedate());
//    private String description;
            row.createCell((short) 22).setCellValue( bill.getDescription());
//    private Byte version;
            row.createCell((short) 23).setCellValue( bill.getVersion());
//    private String isecardpay;
            row.createCell((short) 24).setCellValue( bill.getIsecardpay());
//    private String ecardaccountid;
            row.createCell((short) 25).setCellValue( bill.getEcardaccountid());
//    private String callbackurl;
            row.createCell((short) 26).setCellValue( bill.getCallbackurl());
//    private String virtualgoods;
            row.createCell((short) 27).setCellValue( bill.getVirtualgoods());
//    private Boolean isdeleted;
            row.createCell((short) 28).setCellValue(bill.getIsdeleted());

        }
        // 第六步，将文件存到指定位置
        try
        {
            FileOutputStream fout = new FileOutputStream("E:/bill.xlsx");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fout);
            long startTime = System.currentTimeMillis();   //获取开始时间
            wb.write(fout);
            long endTime = System.currentTimeMillis(); //获取结束时间

            System.out.println("输出流运行时间： " + (endTime - startTime) + "ms");

            fout.close();
            bufferedOutputStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}