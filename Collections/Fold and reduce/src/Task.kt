// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
	val productSets = customers.map { customer ->
	customer.getOrderedProducts()
	}

	if (productSets.isEmpty()) {
		return emptySet()
	}

	return productSets.reduce { commonProducts, customerProducts ->
		commonProducts.intersect(customerProducts)
	}
}

fun Customer.getOrderedProducts(): Set<Product> {
	val products = orders.flatMap { order ->
		order.products
	}
	return products.toSet()
}
