package slpcb;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {

	/**              
	 * 方法描述：测试log4j
	 * 创建人：lanston     
	 * 创建时间：2016-1-25 下午03:57:35    
	 * 修改人：lanston     
	 * 修改时间：2016-1-25 下午03:57:35   
	 * 修改备注：    
	 * @version         
	 */
	public static void main(String[] args) {
		Logger log =  Logger.getLogger(TestLog4j.class);
		PropertyConfigurator.configure("src/log4j.properties");
		log.debug("Yes,debug");
		log.info("Yes,info");
		log.error("Yes,error");
		log.warn("Yes,warn");

	}

}
