// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> {
        val allProducts = orders.flatMap { order ->
		order.products
	}

	return allProducts
}

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts(): Set<Product> {
        val allProducts = customers.flatMap { customer ->
		customer.getOrderedProducts()
	}

	return allProducts.toSet()
}

