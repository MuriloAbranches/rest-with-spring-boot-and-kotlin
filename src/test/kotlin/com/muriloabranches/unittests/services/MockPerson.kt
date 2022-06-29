package com.muriloabranches.unittests.services

import com.muriloabranches.model.Person

class MockPerson {

    fun mockEntityList(): ArrayList<Person> {
        val persons: ArrayList<Person> = ArrayList<Person>()

        for (i in 0..13) {
            persons.add(mockEntity(i))
        }

        return persons
    }

    fun mockEntity(number: Int): Person {
        val person = Person()

        person.address = "Address Test$number"
        person.firstName = "First Name Test$number"
        person.lastName = "Last Name Test$number"
        person.gender = if (number % 2 == 0) "Male" else "Female"
        person.id = number.toLong()

        return person
    }
}