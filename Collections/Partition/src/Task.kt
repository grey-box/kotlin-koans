// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {
	val matchingCustomers = customers.filter { customer -> 
		val(delivered,undelivered) = customer.orders.partition { order ->
			order.isDelivered
		}
	
		undelivered.size > delivered.size
	}
	return matchingCustomers.toSet()
}
