package jp.co.sss.crud.util;

/**
 * 設定値をまとめたクラス(DB操作関連)
 * 
 * @author 劉
 * 
 */
public class DBConstant {
	
	//性別コード
	public static final int GENDER_MALE = 1;
	public static final int GENDER_FEMALE = 2;
	public static final int GENDER_NOT_ANSWERED = 0;
	public static final int GENDER_OTHER = 9;
	
	//部署ID
	public static final int DEPT_SALES = 1;
	public static final int DEPT_ACCOUNTING = 2;
	public static final int DEPT_GENERAL_AFFAIR = 3;
	
	//メッセージ出力
	public static final String MSG_NOT_FOUND = "該当者はいませんでした";
	public static final String MSG_REGIST = "社員情報を登録しました";
	public static final String MSG_DELETE = "社員情報を削除しました";
	
	//情報出力
	public static final String OUTPUT_RECORD_HERADER = "社員ID\t社員名\t性別\t生年月日\t部署名";
	public static final String OUTPUT_GENDER_NOT_ANSWERED = "回答なし" + "\t";
	public static final String OUTPUT_GENDER_MALE = "男性" + "\t";
	public static final String OUTPUT_GENDER_FEMALE = "女性" + "\t";
	public static final String OUTPUT_GENDER_OTHER ="その他" + "\t";
	public static final String OUTPUT_DEPT_SALES = "営業部";
	public static final String OUTPUT_DEPT_ACCOUNTING = "経理部";
	public static final String OUTPUT_DEPT_GENERAL_AFFAIR = "総務部";
	
	//更新情報入力
	public static final String UPDATE_NAME = "社員名：";
	public static final String UPDATE_GENDER = "性別(0:回答しない, 1:男性, 2:女性, 9:その他):";
	public static final String UPDATE_BIRTHDAY = "生年月日(西暦年/月/日)：";
	public static final String UPDATE_DEPT_ID ="部署ID(1：営業部、2：経理部、3：総務部)：";





	//フォーマット
	public static final String FORMAT_BIRTHDAY = "yyyy/MM/dd";

	

}
