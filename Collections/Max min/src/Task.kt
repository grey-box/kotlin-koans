// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? {
        return customers.maxByOrNull { customer -> customer.orders.size }
}

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? {
        val allProducts = mutableListOf<Product>()
	for (order in customer.orders) {
		allProducts.addAll(order.products)
	}
	
	return allProducts.maxByOrNull(Product::price)
}
