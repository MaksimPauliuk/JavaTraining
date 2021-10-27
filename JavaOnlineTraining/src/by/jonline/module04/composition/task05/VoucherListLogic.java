package by.jonline.module04.composition.task05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VoucherListLogic {

	public VoucherList createDefaultVoucherList() {
		List<Voucher> voucherList = new ArrayList<Voucher>();

		voucherList.add(new Voucher(Type.SHOPPING, "Кушадасы", 
                "Tusan Beach Resort 5*", 7, Transport.PLANE, Food.AI, 1250));
		voucherList.add(new Voucher(Type.EXCURTION, "Кушадасы", 
                "Tusan Beach Resort 5*", 7, Transport.BUS, Food.HBP, 1140));
		voucherList.add(new Voucher(Type.CRUISE, "Алания", "Acar 4*", 7, Transport.BUS, Food.HBP, 700));
		voucherList.add(new Voucher(Type.CRUISE, "Алания", "Acar 4*", 14, Transport.BUS, Food.HBP, 1400));
		voucherList.add(new Voucher(Type.CRUISE, "Алания", "Acar 4*", 7, Transport.PLANE, Food.HBP, 850));
		voucherList.add(new Voucher(Type.CRUISE, "Алания", "Acar 4*", 14, Transport.PLANE, Food.HBP, 1700));
		voucherList.add(new Voucher(Type.REST, "Алания", "Acar 4*", 7, Transport.BUS, Food.UAI, 800));
		voucherList.add(new Voucher(Type.REST, "Алания", "Eftalia Island 5*", 7, Transport.PLANE, Food.HBP, 1050));
		voucherList.add(new Voucher(Type.REST, "Алания", "Eftalia Island 5*", 14, Transport.PLANE, Food.HBP, 2050));
		voucherList.add(new Voucher(Type.CRUISE, "Кушадасы", "Grand Blue Sky 4*", 7, Transport.CAR, Food.UAI, 1000));
		voucherList.add(new Voucher(Type.CRUISE, "Кушадасы", "Grand Blue Sky 4*", 14, Transport.CAR, Food.UAI, 2000));
		voucherList.add(new Voucher(Type.CRUISE, "Кушадасы", "Grand Blue Sky 4*", 7, Transport.BUS, Food.UAI, 900));

		return new VoucherList(voucherList);
	}

	public void addVoucher(VoucherList voucherList, Voucher voucher) {
		voucherList.getVouchers().add(voucher);
	}

	public void deleteVoucher(List<Voucher> voucherList, Voucher voucher) {
		voucherList.remove(voucher);
	}

	public VoucherList getVoucherListBy(VoucherList voucherList, int days, Transport transport, Food food) {
		VoucherList tempList = new VoucherList();

		for (Voucher v : voucherList.getVouchers()) {
			if ((v.getDays() == days) 
				&& ((transport == Transport.ANY) || (v.getTransport() == transport))
				&& ((food == Food.ANY)||(v.getFood() == food))) {
				
				addVoucher(tempList, v); 
			}
		}

		return tempList;
	}
	
	public void sortByPlaceAndHotel(VoucherList voucherList) {
		Comparator<Voucher> cmp = Comparator.comparing(obj -> obj.getPlace());
		cmp = cmp.thenComparing(obj -> obj.getHotel());
		voucherList.getVouchers().sort(cmp);
	}
	
	public void sortByPrice(VoucherList voucherList) {
		Comparator<Voucher> cmp = Comparator.comparing(obj -> obj.getPrice());
		voucherList.getVouchers().sort(cmp);
	}
}
