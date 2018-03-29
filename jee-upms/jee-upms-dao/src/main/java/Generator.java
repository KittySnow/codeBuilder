import cn.shenan.common.util.MybatisGeneratorUtil;
import cn.shenan.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by linfujun on 2017/1/10.
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "jee-upms";
	private static String DATABASE = "jlyzparty";
	private static String SCHEMA = "";
	private static String TABLE_PREFIX = "p_";
	private static String PACKAGE_NAME = "cn.dlbdata.dangjian.admin";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap();
	static {
		LAST_INSERT_ID_TABLES.put("p_user", "userid");
	}

	private static Map<String, String> HTML_FILE_NAME = new HashMap();
	static {
		HTML_FILE_NAME.put("p_user", "UserAdmin");
	}

	private static Map<String, String> FILE_CH_NAME = new HashMap();
	static {
		FILE_CH_NAME.put("p_user", "用户");
	}

	/**
	 * 自动代码生成
	 * @param args  SCHEMA,
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER,
			JDBC_URL,
			JDBC_USERNAME,
			JDBC_PASSWORD,
			MODULE,
			DATABASE,
			TABLE_PREFIX,
			PACKAGE_NAME,
			LAST_INSERT_ID_TABLES,
			HTML_FILE_NAME,
			FILE_CH_NAME
		);
	}

}
