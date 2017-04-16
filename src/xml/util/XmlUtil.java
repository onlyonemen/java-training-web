/**
 * 2017-04-08
 * class 4
 * XML语法
 *
 * @author hc
 *
 */

/**
 * 
 <中国>
	<北京>
		<海淀></海淀>
		<丰台></丰台>
	</北京>
	<山东>
		<济南></济南>
		<青岛></青岛>
	</山东>
	<湖北>
		<武汉></武汉>
		<荆州></荆州>
	</湖北>
</中国>

 */

package xml.util;

import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

public class XmlUtil {
	String ROOT = "China";
	String CHILD_1 = "BeiJing";
	String CHILD_1_1 = "HaiDian";
	String CHILD_1_2 = "FengTai";
	String CHILD_2 = "ShanDong";
	String CHILD_2_1 = "JiNan";
	String CHILD_2_2 = "QingDao";
	String CHILD_3 = "HuBei";
	String CHILD_3_1 = "WuHan";
	String CHILD_3_2 = "JingZhou";
	
	public void createXml(){
		Document document = DocumentHelper.createDocument();
		
		//创建根节�?
        Element root = document.addElement(ROOT);
        
        Element child_1=root.addElement(CHILD_1);
        child_1.addElement(CHILD_1_1);
        child_1.addElement(CHILD_1_2);
        
        Element child_2=root.addElement(CHILD_2);
        child_2.addElement(CHILD_2_1);
        child_2.addElement(CHILD_2_2);
        
        Element child_3=root.addElement(CHILD_3);
        child_3.addElement(CHILD_3_1);
        child_3.addElement(CHILD_3_2);
        
        //save to file

		try {
			XMLWriter writer = new XMLWriter(new FileWriter("src/xml/city.xml"));
			writer.write(document);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
	public static void main(String[] args) {
		new XmlUtil().createXml();
	}
}
