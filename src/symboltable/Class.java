package symboltable;

import java.util.Enumeration;
import java.util.Hashtable;

import ast.IdentifierType;
import ast.Type;

public class Class {

	String id;
	Hashtable<Object, Method> methods;
	Hashtable<Object, Variable> globals;
	String parent;
	Type type;

	public Class(String id, String p) {
		this.id = id;
		parent = p;
		type = new IdentifierType(id);
		methods = new Hashtable<Object, Method>();
		globals = new Hashtable<Object, Variable>();
	}

	public Class() {
	}

	public String getId() {
		return id;
	}

	public Type type() {
		return type;
	}

	public boolean addMethod(Method m) {
		if (containsMethod(m.id))
			return false;
		else {
			methods.put(m.id, m);
			return true;
		}
	}

	public Enumeration getMethods() {
		return methods.keys();
	}

	public Method getMethod(String id) {
		if (containsMethod(id))
			return (Method) methods.get(id);
		else
			return null;
	}

	public boolean addVar(String id, Type type) {
		if (globals.containsKey(id))
			return false;
		else {
			globals.put(id, new Variable(id, type));
			return true;
		}
	}

	public Variable getVar(String id) {
		if (containsVar(id))
			return (Variable) globals.get(id);
		else
			return null;
	}

	public boolean containsVar(String id) {
		return globals.containsKey(id);
	}

	public boolean containsMethod(String id) {
		return methods.containsKey(id);
	}

	public String parent() {
		return parent;
	}
} // Class