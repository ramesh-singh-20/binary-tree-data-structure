package com.alphacoder.datastructure

import spock.lang.Specification

class BinarySearchTreeTest extends Specification {
    def 'Test BinarySearchTree | isEmpty() | Tree is empty'() {
        given:
        def tree= new BinarySearchTree()

        when:
        def result= tree.isEmpty()

        then:
        result
    }

    def 'Test BinarySearchTree | isEmpty() | Tree is not empty'() {
        given:
        def tree= new BinarySearchTree()

        when:
        tree.insert(12)

        then:
        !tree.isEmpty()
    }

    def 'Test BinarySearchTree | insert() | Insert multiple values'() {
        given:
        def tree= new BinarySearchTree()

        when:
        tree.insert(12)
        tree.insert(3)
        tree.insert(15)

        then:
        !tree.isEmpty()
    }

    def 'Test BinarySearchTree | search() | tree is empty'() {
        given:
        def tree= new BinarySearchTree()

        when:
        def result= tree.search(0)

        then:
        !result
    }

    def 'Test BinarySearchTree | search() | value is present'() {
        given:
        def tree= new BinarySearchTree()
        tree.insert(12)
        tree.insert(3)
        tree.insert(15)
        tree.insert(11)
        tree.insert(1)

        when:
        def result= tree.search(1)

        then:
        result
    }

    def 'Test BinarySearchTree | search() | value is not present'() {
        given:
        def tree= new BinarySearchTree()
        tree.insert(12)
        tree.insert(3)
        tree.insert(15)
        tree.insert(11)
        tree.insert(1)

        when:
        def result= tree.search(10)

        then:
        !result
    }
}
