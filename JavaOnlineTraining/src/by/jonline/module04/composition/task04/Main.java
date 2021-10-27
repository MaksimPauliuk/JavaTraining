package by.jonline.module04.composition.task04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим 
 * положительный и отрицательный балансы отдельно.
 */

public class Main {
	
	public static void main(String[] args) {
		Client client;
		ClientLogic cLogic = new ClientLogic();
		ClientView cView = new ClientView();
		BankAccountLogic bALogic = new BankAccountLogic();
		
		client = cLogic.createDefaultClient();
		cView.showClientInfo(client);
		
		System.out.println("Добавим новый счет и заблокиуем 3-ий:");
		cLogic.addBankAccount(client, new BankAccount("BY20OLMP31350051951510009312", -1951951.05, true));
		bALogic.blockAccount(cLogic.findAccountByNumber(client, "BY20OLMP31659816516654009312"));
		cView.showAccountList(client.getAccounts());
		
		bALogic.addBalance(client.getAccounts().get(1), 48512);
    	bALogic.reduceBalance(client.getAccounts().get(2), 50000);
    	bALogic.unblockAccount(client.getAccounts().get(2));
    	bALogic.reduceBalance(client.getAccounts().get(2), 50000);
    	
    	cView.showAccountList(client.getAccounts());
    	cView.showSortAccounts(client);
    	cView.showActiveAccounts(client);
    	cView.showBlockedAccounts(client);
    	cView.showTotalBalance(client);
    	cView.showTotalPositiveBalance(client);
    	cView.showTotalNegativeBalance(client);
	}
}
