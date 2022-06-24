package singletonPatternLazyLoading;

public class LazyLoadingUniqueObject {
	
	// constructor make private= no object creation  
	
 private  LazyLoadingUniqueObject() {
	 
 }
 // no one can excess the object
 //1.not in cache but need a fresh object for every call 
  private static volatile LazyLoadingUniqueObject lazyLoadingUniqueObject =null;
  
  // easy class level object available for all(public) 
  //1. Threadsafe now 
  //2. Make only the critical section synchronized not the whole method 
  public static   LazyLoadingUniqueObject getInstance(){
	  
	  synchronized (lazyLoadingUniqueObject) {
		  if(lazyLoadingUniqueObject==null) {
			  
			  lazyLoadingUniqueObject = new LazyLoadingUniqueObject();
		  }
	} 
	  return lazyLoadingUniqueObject;  
  }
}
