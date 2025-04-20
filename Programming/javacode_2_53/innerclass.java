

/*5. Create a class containing an inner class that itself contains an inner class. Repeat this using
static inner class. What are the names of the .class files produced by the compiler?*/


//Outer class
class O {
	// Non-static inner class
	class I {
		// Non-static inner class
		class I1 {
			void display() {
				System.out.println("Inside InnerMost class");
			}
		}
	}
		void createinner() {
			I inner = new I();
			
			I.I1 innerMost = inner.new I1();
			innerMost.display();
		}
	}
//Outer class
	class OS {
		// Static inner class
		static class IS {
			// Static inner class
			static class I1S {
				void display() {
					System.out.println("Inside InnerMostStatic class");
				}
			}
		}
		void createinner1() {
			/*IS inner1 = new IS();
			
			IS.I1S innerMost = inner1.new I1S();*/
			IS.I1S innerMost = new IS.I1S();
			
			innerMost.display();
		}
	}


	public class innerclass {
		public static void main(String[] args) {
			
			O outer = new O();
			OS outer1=new OS();
			outer.createinner();
			outer1.createinner1();
		}
	}

