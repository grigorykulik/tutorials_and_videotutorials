package java_lessons.lesson_311_generics;

public class Example1 {

}

// not a generic
class Parent{ }

// a generic class can be inherited from a non-generic class
class GenericParent<T> extends Parent { }

// a non-generic class can be inherited from a generic
class Child extends GenericParent {}

// will not compile
// class Child2 extends GenericParent<T>{ }

// will compile
class Child3 extends GenericParent<String> { }

// will compile
class Child4<T> extends GenericParent<T> { }

// will compile
class Child5<X, T, Y> extends GenericParent<T> { }

// will compile
class Child6<X, Y, T> extends GenericParent { }