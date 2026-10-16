// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double {
       var total = 0.0

	for (order in customer.orders) {
		val orderTotal = order.products.sumOf { product ->
			product.price
		}
		
		total += orderTotal
	}
	return total
}
