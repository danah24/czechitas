#parse("File Header.java")
#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

public class ${Name}{

    private static ${Name} instance = new ${Name}();

    public synchronized static ${Name} getInstance() {
        return ourInstance;
    }

    private ${Name}() {
    }
}
