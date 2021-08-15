
public class DataFlowApp {
	
	public static void main(String[] args) {
		int a = 10;
		byte b = DataTransformer.integerToByte(a);
		Typetester.printType(b);
		int c = DataTransformer.byteToInteger(b);
		Typetester.printType(c);
		double d = DataTransformer.integerToDouble(c);
		Typetester.printType(d);
		int e = DataTransformer.doubleToInteger(d);
		Typetester.printType(e);
		short f = DataTransformer.integerToShort(e);
		Typetester.printType(f);
		int j = DataTransformer.shortToInteger(f);
		Typetester.printType(j);
		short h = DataTransformer.doubleToShort(d);
		Typetester.printType(h);
		
		
		
		
	}
}

// secondary class
class DataTransformer {
	
	static  byte integerToByte( int value ) {
		if ( value >= -127 & value <= 127) {
			
			return (byte)value;
			}
		else {
			System.out.println("WARNING! The value \" " + value + " \" overflows \"byte\" range. DATA will was lost!");
			return 0;
		}			
	}
	
	static  int byteToInteger( byte value ) {
					
			return (int) value;
		}
	
	static double integerToDouble( int value) {
           
			return (double)value;
			
		}
	
	static  int doubleToInteger( double value ) {
		if ( value >= -2147483648 & value <= 2147483647) {
			
			return (int)value;
			}
		else {
			System.out.println("WARNING! The value \" " + value + " \" overflows \"integer\" range. DATA will was lost!");
			return 0;
		}			
			
}
	static  short integerToShort( int value ) {
		if ( value >= -32768 & value <= 32767) {
			
			return (short)value;
			}
		else {
			System.out.println("WARNING! The value \" " + value + " \" overflows \"short\" range. DATA will was lost!");
			return 0;
		}	
	}
	
	static int shortToInteger( short value) {
        
		return (int)value;
		
	}
	
	static  short doubleToShort( double value ) {
	    if ( value >= -32768 & value <= 32767) {
			      // преобразовываем в Short, чтоб получить целую часть числа
			      short intPart = (short) value;
			      // получаем дробную часть
			      double fracPart = value - intPart;
			      if (fracPart >= 0.5) {
			        intPart ++;
			      }
			      return(intPart);
			    }
			    else {
			      System.out.println("WARNING! The value \" + value + \" overflows \"integer\" range. DATA will was lost!");
			      return(0);
			    }
			  }
	
	}

// Check type class
    class Typetester {
    static void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    static void printType(int x) {
        System.out.println(x + " is an int");
    }
    static void printType(float x) {
        System.out.println(x + " is an float");
    }
    static void printType(double x) {
        System.out.println(x + " is an double");
    }
    static void printType(char x) {
        System.out.println(x + " is an char");
    }
    static void printType(short x) {
        System.out.println(x + " is an short");
    }
}

	
	
	
	

	


