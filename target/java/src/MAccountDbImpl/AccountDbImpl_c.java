package MAccountDbImpl;
// AccountDb.abs:20:0: 
public class AccountDbImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MAccountDbImpl.AccountDb_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public AccountDbImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountDbImpl"; }
    public static final <T extends AccountDbImpl_c> T createNewCOG() { return (T)AccountDbImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountDbImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountDbImpl_c.class) : __ABS_runtime.createCOG(AccountDbImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountDbImpl_c __ABS_result = (AccountDbImpl_c) __ABS_runtime.getForeignObject
            ("MAccountDbImpl.AccountDbImpl");
            if (__ABS_result == null) __ABS_result = new AccountDbImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountDbImpl_c> T createNewObject() { return (T)AccountDbImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountDbImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountDbImpl_c __ABS_result = (AccountDbImpl_c) abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().getForeignObject
        ("MAccountDbImpl.AccountDbImpl");
        if (__ABS_result == null) __ABS_result = new AccountDbImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "findAllByAttributes";
                }
                public Object execute() {
                    return target.findAllByAttributes(arg0
                    ,arg1
                    );
                }
            }.init(className, query))
        ;
    }
    // AccountDb.abs:0:0: 
    public final ABS.StdLib.List<MAccountModel.Account_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        return this.fli_findAllByAttributes(className, query);
    }
    // AccountDb.abs:0:0: 
    public  ABS.StdLib.List<MAccountModel.Account_i> fli_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findAllByAttributes");
            __ABS_currentTask.setLocalVariable("className",className);
            __ABS_currentTask.setLocalVariable("query",query);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",23);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.List_Nil();
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_findAll(abs.backend.java.lib.types.ABSString className) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "findAll";
                }
                public Object execute() {
                    return target.findAll(arg0
                    );
                }
            }.init(className))
        ;
    }
    // AccountDb.abs:0:0: 
    public final ABS.StdLib.List<MAccountModel.Account_i> findAll(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        return this.fli_findAll(className);
    }
    // AccountDb.abs:0:0: 
    public  ABS.StdLib.List<MAccountModel.Account_i> fli_findAll(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findAll");
            __ABS_currentTask.setLocalVariable("className",className);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",26);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.List_Nil();
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "findByAttributes";
                }
                public Object execute() {
                    return target.findByAttributes(arg0
                    ,arg1
                    );
                }
            }.init(className, query))
        ;
    }
    // AccountDb.abs:0:0: 
    public final MAccountModel.Account_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        return this.fli_findByAttributes(className, query);
    }
    // AccountDb.abs:0:0: 
    public  MAccountModel.Account_i fli_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findByAttributes");
            __ABS_currentTask.setLocalVariable("className",className);
            __ABS_currentTask.setLocalVariable("query",query);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",29);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MAccountModel.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_find(abs.backend.java.lib.types.ABSString className) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "find";
                }
                public Object execute() {
                    return target.find(arg0
                    );
                }
            }.init(className))
        ;
    }
    // AccountDb.abs:0:0: 
    public final MAccountModel.Account_i find(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        return this.fli_find(className);
    }
    // AccountDb.abs:0:0: 
    public  MAccountModel.Account_i fli_find(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "find");
            __ABS_currentTask.setLocalVariable("className",className);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",32);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MAccountModel.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MAccountModel.Account_i object) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                MAccountModel.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(MAccountModel.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "save";
                }
                public Object execute() {
                    return target.save(arg0
                    );
                }
            }.init(object))
        ;
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit save(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        return this.fli_save(object);
    }
    // AccountDb.abs:0:0: 
    public  abs.backend.java.lib.types.ABSUnit fli_save(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "save");
            __ABS_currentTask.setLocalVariable("object",object);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MAccountModel.Account_i object) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                MAccountModel.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(MAccountModel.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "delete";
                }
                public Object execute() {
                    return target.delete(arg0
                    );
                }
            }.init(object))
        ;
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit delete(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        return this.fli_delete(object);
    }
    // AccountDb.abs:0:0: 
    public  abs.backend.java.lib.types.ABSUnit fli_delete(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("object",object);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(MAccountModel.Account_i object) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                MAccountModel.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(MAccountModel.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    );
                }
            }.init(object))
        ;
    }
    // AccountDb.abs:0:0: 
    public final MAccountModel.Account_i update(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        return this.fli_update(object);
    }
    // AccountDb.abs:0:0: 
    public  MAccountModel.Account_i fli_update(MAccountModel.Account_i object) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("object",object);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",39);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return MAccountModel.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountDbImpl.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "log";
                }
                public Object execute() {
                    return target.log(arg0
                    );
                }
            }.init(log))
        ;
    }
    // AccountDb.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log) {
        __ABS_checkSameCOG(); 
        return this.fli_log(log);
    }
    // AccountDb.abs:0:0: 
    public  abs.backend.java.lib.types.ABSString fli_log(abs.backend.java.lib.types.ABSString log) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "log");
            __ABS_currentTask.setLocalVariable("log",log);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("C:\\Users\\Afifun\\Documents\\afifun\\prototipe-proposal-tesi\\abs-microservices-framework-new\\src\\abs\\repository\\AccountDb.abs",42);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSString.fromString("return log");
        }
    }
}
