package org.mashimom

class SimpleClassSpec extends spock.lang.Specification {
	def "wrong exception thrown"() {
		when:
		SimpleClass.count(null)

		then:
		thrown IllegalArgumentException
	}
}
