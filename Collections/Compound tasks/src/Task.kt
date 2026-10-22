// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
	val deliveredOrders = customer.orders.filter { order ->
		order.isDelivered
	}

	val deliveredProducts = deliveredOrders.flatMap { order ->
		order.products
	}
	
	return deliveredProducts.maxByOrNull { product ->
		product.price
	}
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
	val allProducts = customers.flatMap { customer ->
		customer.getOrderedProducts()
	}

	return allProducts.count { orderedProduct ->
		orderedProduct == product
	}
}

fun Customer.getOrderedProducts(): List<Product> {
	val products = orders.flatMap { order ->
		order.products
	}
	return products
}
