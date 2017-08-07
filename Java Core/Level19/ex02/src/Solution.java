
/*
Адаптация нескольких интерфейсов
*/

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static Map<String, String> countries = new HashMap<String, String>();

	static {
		countries.put("UA", "Ukraine");
		countries.put("RU", "Russia");
		countries.put("CA", "Canada");
	}

	public static void main(String[] args) {

	}


	public static class IncomeDataAdapter implements Contact, Customer {

		private IncomeData	data;

		public IncomeDataAdapter(IncomeData data) {
			this.data = data;
		}

		@Override
		public String getCompanyName() {
			return (data.getCompany());
		}

		@Override
		public String getCountryName() {
			return (countries.get(data.getCountryCode()));
		}

		@Override
		public String getName() {
			return (data.getContactLastName() + ", " + data.getContactFirstName());
		}

		@Override
		public String getPhoneNumber() {

			StringBuilder	s = new StringBuilder("+");

			s.append(data.getCountryPhoneCode());
			s.append("0" + data.getPhoneNumber());
			s.insert(3, '(');
			s.insert(7, ')');
			s.insert(11, '-');
			s.insert(14, '-');

			return (s.toString());
		}
	}


	public static interface IncomeData {
		String getCountryCode();        //example UA

		String getCompany();            //example JavaRush Ltd.

		String getContactFirstName();   //example Ivan

		String getContactLastName();    //example Ivanov

		int getCountryPhoneCode();      //example 38

		int getPhoneNumber();           //example 501234567
	}

	public static interface Customer {
		String getCompanyName();        //example JavaRush Ltd.

		String getCountryName();        //example Ukraine
	}

	public static interface Contact {
		String getName();               //example Ivanov, Ivan

		String getPhoneNumber();        //example +38(050)123-45-67
	}
}