// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> {
	return customers.associateBy { customer ->
		customer.name
	}
}

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> {
	return customers.associateWith { customer ->
		customer.city
	}
}

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> {
	return customers.associate { customer ->
		customer.name to customer.city
	}
}
