package i18nTest;

import java.util.Locale;

public class i18nTry {

	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE/*new Locale("fr", "FR")*/);
		System.out.println(Messages.getString("i18nTry.0")); //$NON-NLS-1$
		
		System.out.println(Messages.getString("i18nTry.1")); //$NON-NLS-1$
		System.out.println("Go ahead. Ignore me."); //$NON-NLS-1$
		System.out.println("Please. Won't you internalize me?");
	}

}
