package by.jonline.module04.composition.task05;

public class VoucherListView {
	
	public void showVoucherList(VoucherList voucherList, String message) {
		System.out.println(message);
		System.out.println("Тип путевки|Место       |Отель                    |Дни|Транспорт|Еда|Стоимость");
		for(Voucher v:voucherList.getVouchers()) {
			System.out.printf("%11s|%12s|%25s|%3d|%9s|%3s|%d%n",v.getType(),v.getPlace(),v.getHotel(),v.getDays(),v.getTransport(),v.getFood(),v.getPrice());
		}
		System.out.println();
	}
}
