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

    def 'Test BinarySearchTree | minimum() | tree is empty'(){
        given:
        def tree= new BinarySearchTree()

        when:
        tree.minimum()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test BinarySearchTree | minimumRecursively() | tree is empty'(){
        given:
        def tree= new BinarySearchTree()

        when:
        tree.minimumRecursively()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test BinarySearchTree | minimum() | tree is not empty'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)
        tree.insert(10)
        tree.insert(20)
        tree.insert(8)
        tree.insert(12)
        tree.insert(17)
        tree.insert(25)

        when:
        def result= tree.minimum()

        then:
        result== 8
    }

    def 'Test BinarySearchTree | minimumRecursively() | tree is not empty'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)
        tree.insert(10)
        tree.insert(20)
        tree.insert(8)
        tree.insert(12)
        tree.insert(17)
        tree.insert(25)

        when:
        def result= tree.minimumRecursively()

        then:
        result== 8
    }

    def 'Test BinarySearchTree | minimum() | only one element'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)

        when:
        def result= tree.minimum()

        then:
        result== 15
    }

    def 'Test BinarySearchTree | minimumRecursively() | only one element'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)

        when:
        def result= tree.minimumRecursively()

        then:
        result== 15
    }

    def 'Test BinarySearchTree | maximum() | tree is empty'(){
        given:
        def tree= new BinarySearchTree()

        when:
        tree.maximum()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test BinarySearchTree | maximumRecursively() | tree is empty'(){
        given:
        def tree= new BinarySearchTree()

        when:
        tree.maximumRecursively()

        then:
        thrown(UnsupportedOperationException)
    }

    def 'Test BinarySearchTree | maximum() | tree is not empty'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)
        tree.insert(10)
        tree.insert(20)
        tree.insert(8)
        tree.insert(12)
        tree.insert(17)
        tree.insert(25)

        when:
        def result= tree.maximum()

        then:
        result== 25
    }

    def 'Test BinarySearchTree | maximumRecursively() | tree is not empty'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)
        tree.insert(10)
        tree.insert(20)
        tree.insert(8)
        tree.insert(12)
        tree.insert(17)
        tree.insert(25)

        when:
        def result= tree.maximumRecursively()

        then:
        result== 25
    }

    def 'Test BinarySearchTree | maximum() | only one element'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)

        when:
        def result= tree.maximum()

        then:
        result== 15
    }

    def 'Test BinarySearchTree | maximumRecursively() | only one element'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(15)

        when:
        def result= tree.maximumRecursively()

        then:
        result== 15
    }

    def 'Test BinarySearchTree | height() | tree is empty.'(){
        given:
        def tree= new BinarySearchTree()

        when:
        def result= tree.height()

        then:
        result== -1
    }

    def 'Test BinarySearchTree | height() | only one element'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(1)

        when:
        def result= tree.height()

        then:
        result== 0
    }

    def 'Test BinarySearchTree | height() | multiple elements'(){
        given:
        def tree= new BinarySearchTree()
        tree.insert(10)
        tree.insert(4)
        tree.insert(8)
        tree.insert(15)
        tree.insert(12)
        tree.insert(7)
        tree.insert(0)
        tree.insert(13)
        tree.insert(11)


        when:
        def result= tree.height()

        then:
        result== 3
    }
}
