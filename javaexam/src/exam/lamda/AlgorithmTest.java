package exam.lamda;

class AlgoImpl implements Algorithm {
	@Override
	public int exec(int i, int j) {
		return i+j;
	}
}

public class AlgorithmTest {
	
//	public static void useAlgorithm(Algorithm algorithm) {
	
	public void useAlgorithm(AlgoImpl algoImpl) {
		int value = algoImpl.exec(10,5);
		System.out.println(value);
	}
	
	public void useAlgorithm2(Algorithm algo) {
		int value = algo.exec(10,5);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		// general
		AlgoImpl algoImpl = new AlgoImpl();
		
		AlgorithmTest algoTest = new AlgorithmTest();

		algoTest.useAlgorithm(algoImpl);
		algoTest.useAlgorithm(new AlgoImpl() {
			@Override
			public int exec(int i, int j){
				return i*j;
			}
		});
				 
		// new interface ?``
		algoTest.useAlgorithm2(new Algorithm() {
			@Override
			public int exec(int i, int j){
				return i*j* 10;
			}
		});
	
		// lamda
		//algoTest.useAlgorithm((int i, int j) -> {return i-j;});  // error!! -- class
		algoTest.useAlgorithm2((int i, int j) -> {return i-j;});  // interface
	}
}
