class LazyProperty(val initializer: () -> Int) {
    private var initialized = false
    private var savedValue = 0

    val lazy: Int
        get() {
            if (!initialized) {
		savedValue = initializer()
		initialized = true
	    }
	    return savedValue
        }
}
