package jp.co.sss.crud.util;

/**
 * 設定値をまとめたクラス(DB操作関連)
 * 
 * @author 劉
 * 
 */
public class ConstantMain {
	
	//メニュー表示
	public static final String OUTPUT_MENU_SYSTEM_TITLE = "=== 社員管理システム ===";
	public static final String OUTPUT_MENU_SHOW_ALL = "1.全件表示";
	public static final String OUTPUT_MENU_SEARCH_BY_NAME = "2.社員名検索";
	public static final String OUTPUT_MENU_SEARCH_BY_DEPT_ID = "3.部署ID検索";
	public static final String OUTPUT_MENU_INSERT = "4.新規登録";
	public static final String OUTPUT_MENU_UPDATE = "5.更新";
	public static final String OUTPUT_MENU_DELETE = "6.削除";
	public static final String OUTPUT_MENU_CLOSE = "7.終了";
	
	//メニュー番号
	public static final int MENU_SHOW_ALL = 1;
	public static final int MENU_SEARCH_BY_NAME = 2;
	public static final int MENU_SEARCH_BY_DEPT_ID = 3;
	public static final int MENU_INSERT = 4;
	public static final int MENU_UPDATE = 5;
	public static final int MENU_DELETE = 6;
	public static final int MENU_CLOSE = 7;
	
	//メッセージ表示
	public static final String MSG_INPUT_MENU = "メニュー番号を入力してください：";
	public static final String MSG_UPDATE = "更新する社員の社員IDを入力してください：";
	public static final String MSG_UPDATE_DONE = "社員情報を更新しました";
	public static final String MSG_DELETE = "削除する社員の社員IDを入力してください：";
	public static final String MSG_CLOSE = "システムを終了します。";




	public static final String MSG_SEARCH_BY_NAME = "社員名:";
	public static final String MSG_SEARCH_BY_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";
	public static final String INSERT_NAME = "社員名:";
	public static final String INSERT_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	public static final String INSERT_BIRTHDAY = "生年月日(西暦年/月/日):";
	public static final String INSERT_DEPT_ID ="部署ID(1:営業部、2:経理部、3:総務部):";
	

	

	
	

	

	



	


	

}
