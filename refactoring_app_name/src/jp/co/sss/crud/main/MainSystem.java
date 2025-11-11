package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.db.DBController;
import jp.co.sss.crud.util.ConstantMain;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int menuNo = 0;

		do {
			// メニューの表示
			System.out.println(ConstantMain.OUTPUT_MENU_SYSTEM_TITLE);
			System.out.println(ConstantMain.OUTPUT_MENU_SHOW_ALL);
			System.out.println(ConstantMain.OUTPUT_MENU_SEARCH_BY_NAME);
			System.out.println(ConstantMain.OUTPUT_MENU_SEARCH_BY_DEPT_ID);
			System.out.println(ConstantMain.OUTPUT_MENU_INSERT);
			System.out.println(ConstantMain.OUTPUT_MENU_UPDATE);
			System.out.println(ConstantMain.OUTPUT_MENU_DELETE);
			System.out.println(ConstantMain.OUTPUT_MENU_CLOSE);
			System.out.print(ConstantMain.MSG_INPUT_MENU);

			// メニュー番号の入力
			String menuNoStr = reader.readLine();
			menuNo = Integer.parseInt(menuNoStr);

			// 機能の呼出
			switch (menuNo) {
			case ConstantMain.MENU_SHOW_ALL:
				// 全件表示機能の呼出
				DBController.findAll();
				break;

			case ConstantMain.MENU_SEARCH_BY_NAME:
				// 社員名検索
				System.out.print(ConstantMain.MSG_SEARCH_BY_NAME);

				// 検索機能の呼出
				DBController.findByEmpName();
				break;

			case ConstantMain.MENU_SEARCH_BY_DEPT_ID:
				// 検索する部署IDを入力
				System.out.print(ConstantMain.MSG_SEARCH_BY_DEPT_ID);
				String deptId = reader.readLine();

				// 検索機能の呼出
				DBController.findByDeptId(deptId);
				break;

			case ConstantMain.MENU_INSERT:
				// 登録する値を入力
				System.out.print(ConstantMain.INSERT_NAME);
				String empName = reader.readLine();
				System.out.print(ConstantMain.INSERT_GENDER);
				String gender = reader.readLine();
				System.out.print(ConstantMain.INSERT_BIRTHDAY);
				String birthday = reader.readLine();
				System.out.print(ConstantMain.INSERT_DEPT_ID);
				String inputDeptId = reader.readLine();

				// 登録機能の呼出
				DBController.insertEmp(empName, gender, birthday, inputDeptId);
				break;

			case ConstantMain.MENU_UPDATE:
				// 更新する社員IDを入力
				System.out.print(ConstantMain.MSG_UPDATE);

				// 更新する値を入力する
				String empId = reader.readLine();
				Integer.parseInt(empId);

				// 更新機能の呼出
				DBController.updateEmp(empId);
				System.out.println(ConstantMain.MSG_UPDATE_DONE);

				break;

			case ConstantMain.MENU_DELETE:
				// 削除する社員IDを入力
				System.out.print(ConstantMain.MSG_DELETE);
				// 削除機能の呼出
				DBController.deleteEmp();
				break;

			}
		} while (menuNo != ConstantMain.MENU_CLOSE);
		System.out.println(ConstantMain.MSG_CLOSE);
	}
}
