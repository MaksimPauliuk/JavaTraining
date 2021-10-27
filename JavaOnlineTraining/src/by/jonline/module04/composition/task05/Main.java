package by.jonline.module04.composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору 
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, 
 * круиз и т. д.) для оптимального выбора. Учитывать возможность выбора 
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {
		VoucherList voucherList;
		VoucherListLogic vll = new VoucherListLogic();
		VoucherListView vlw = new VoucherListView();
		
		voucherList = vll.createDefaultVoucherList();
		vlw.showVoucherList(voucherList, "Список путевок:");
		
		vll.sortByPlaceAndHotel(voucherList);
		vlw.showVoucherList(voucherList, "Список путевок по месту и отелю:");
		
		vll.sortByPrice(voucherList);
		vlw.showVoucherList(voucherList, "Список путевок по стоимости:");
		
		VoucherList requestOfvouchers = vll.getVoucherListBy(voucherList, 14, Transport.ANY, Food.HBP);
		vlw.showVoucherList(requestOfvouchers, "Список путевок по запросу:");
		
		requestOfvouchers = vll.getVoucherListBy(voucherList, 7, Transport.BUS, Food.ANY);
		vlw.showVoucherList(requestOfvouchers, "Список путевок по запросу:");
		
	}

}
