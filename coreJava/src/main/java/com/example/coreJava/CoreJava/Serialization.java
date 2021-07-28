package com.example.coreJava.CoreJava;

public class Serialization {
	
public static void main(String[] args) {
		
	}
	
	
	
	

}

/*
 * 1.To make a Java object serializable we implement the java.io.Serializable
 * interface.
 * 
 * 2.The byte stream created is platform independent. So, the object serialized
 * on one platform can be deserialized on a different platform.
 * 
 * 
 * 3.Serialization is a mechanism of converting the state of an object into a
 * byte stream. 4.Deserialization is the reverse process where the byte stream
 * is used to recreate the actual Java object in memory. This mechanism is used
 * to persist the object.
 * 
 * Advantages of Serialization -------------------------------- 5. To
 * save/persist state of an object. 6. To travel an object across a network.
 * 
 * 7.Serializable is a marker interface (has no data member and method). It is
 * used to “mark” java classes so that objects of these classes may get certain
 * capability.
 * 
 * 
 * Points to remember ----------------------------- 1. If a parent class has
 * implemented Serializable interface then child class doesn’t need to implement
 * it but vice-versa is not true. 2. Only non-static data members are saved via
 * Serialization process. 3. Static data members and transient data members are
 * not saved via Serialization process.So, if you don’t want to save value of a
 * non-static data member then make it transient. 4. Constructor of object is
 * never called when an object is deserialized. 5. Associated objects must be
 * implementing Serializable interface. Other examples of marker interfaces
 * are:- Cloneable and Remote.
 * 
 * 
 * 
 * You have seen while deserializing the object the values of a and b has
 * changed. The reason being a was marked as transient and b was static. In case
 * of transient variables:- A variable defined with transient keyword is not
 * serialized during serialization process. This variable will be initialized
 * with default value during deserialization. (e.g: for objects it is null, for
 * int it is 0).
 * 
 * 
 * SerialVersionUID The Serialization runtime associates a version number with
 * each Serializable class called a SerialVersionUID, which is used during
 * Deserialization to verify that sender and reciever of a serialized object
 * have loaded classes for that object which are compatible with respect to
 * serialization. If the reciever has loaded a class for the object that has
 * different UID than that of corresponding sender’s class, the Deserialization
 * will result in an InvalidClassException. A Serializable class can declare its
 * own UID explicitly by declaring a field name.
 
In case of static Variables:- A variable defined with static keyword is not serialized during serialization process.
This variable will be loaded with current value defined in the class during deserialization.

*/