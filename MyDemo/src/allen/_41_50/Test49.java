package allen._41_50;
//package lcy._41_50;
//
//import org.xvolks.jnative.JNative;
//import org.xvolks.jnative.Type;
//import org.xvolks.jnative.pointers.Pointer;
//import org.xvolks.jnative.pointers.memory.MemoryBlock;
//import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;
//
//public class Test49 {
//
//	 public static void main(String[] args) throws Exception {  
//		 try {
//	    		System.load("C:\\Users\\lanston\\Desktop\\decryption.dll");
//	    		JNative getResult = new JNative("decryption.dll", "decryption");
//	    		getResult.setRetVal(Type.STRING);//返回状态
//	    		getResult.setParameter(0, "2428111437dg14w4==");
//	    		getResult.setParameter(1, "slpcbpasswd");
//	    		MemoryBlock m = MemoryBlockFactory.createMemoryBlock(1024);
//	    		//指向内存块的指针
//	    		Pointer pp = new Pointer(m);
//	    		getResult.setParameter(7, pp); //输出参数
//	    		getResult.invoke();
//	    		System.out.println(pp.getAsString());//输出参数
//	    		getResult.dispose(); // 记得释放 
//	    		} catch (Exception e) {
//	    		e.printStackTrace();
//	    		}
//		}
//	 
//	    public String Decrypt(String code) 
//	    {
//	    	String result="";
//	    	try {
//	    		System.load("C:\\Users\\lanston\\Desktop\\decryption.dll");
//	    		JNative getResult = new JNative("decryption.dll", "decryption");
//	    		getResult.setRetVal(Type.STRING);//返回状态
//	    		getResult.setParameter(0, code);
//	    		getResult.setParameter(1, "slpcbpasswd");
//	    		MemoryBlock m = MemoryBlockFactory.createMemoryBlock(1024);
//	    		//指向内存块的指针
//	    		Pointer pp = new Pointer(m);
//	    		getResult.setParameter(7, pp); //输出参数
//	    		getResult.invoke();
//	    		result=pp.getAsString();//输出参数
//	    		getResult.dispose(); // 记得释放 
//	    		} catch (Exception e) {
//	    		e.printStackTrace();
//	    		}
//
//			return result;
//		}
//	 
//}
