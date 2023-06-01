public enum ClassUniqueInstance {
    
    INSTANCE("Initial class click"); 
 
    private interger click;
 
    private EnumSingleton(interger click) {
        this.click = click;
    }
 
    public EnumSingleton getInstance() {
        return INSTANCE;
    }
    
    public interger getClick(){
        return this.click;
    }

    public interger setClick(integer click){
        return this.click = click;
    }
}