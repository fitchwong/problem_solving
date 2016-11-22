package com.codepicker.lib;

/**
 * Created by Rayson Yeung on 18/4/2016.
 */
public final class Logger {

	private static boolean logEnabled = true;

	private static boolean fullLog = false;

	public static void setLogEnabled(boolean value) {
		logEnabled = value;
	}

	public static void setFullLog(boolean value) {
		fullLog = value;
	}

	public static void log(Object value) {
		logInternal(value.toString());
	}

	public static void log(String value) {
		logInternal(value);
	}

	public static void log(int value) {
		logInternal(Integer.toString(value));
	}

	public static void log(float value) {
		logInternal(Float.toString(value));
	}

	public static void log(double value) {
		logInternal(Double.toString(value));
	}

	public static void log(long value) {
		logInternal(Long.toString(value));
	}

	public static void log(char value) {
		logInternal(Character.toString(value));
	}

	public static void log(boolean value) {
		logInternal(Boolean.toString(value));
	}

	public static void log(byte value) {
		logInternal(Byte.toString(value));
	}

	public static void log(StackTraceElement element) {
		System.out.println("Line " + element.getLineNumber() + ": " + element.getMethodName() + "()");
	}

	public static void warning(String value) {
		warningInternal(value);
	}

	public static void warning(int value) {
		warningInternal(Integer.toString(value));
	}

	public static void warning(float value) {
		warningInternal(Float.toString(value));
	}

	public static void warning(double value) {
		warningInternal(Double.toString(value));
	}

	public static void warning(long value) {
		warningInternal(Long.toString(value));
	}

	public static void warning(char value) {
		warningInternal(Character.toString(value));
	}

	public static void warning(boolean value) {
		warningInternal(Boolean.toString(value));
	}

	public static void warning(byte value) {
		warningInternal(Byte.toString(value));
	}

	public static void warning(StackTraceElement element) {
		System.out.println(
				element.getClassName() + " Line " + element.getLineNumber() + ": " + element.getMethodName() + "()");
	}

	public static void info(String value) {
		infoInternal(value);
	}

	public static void info(int value) {
		infoInternal(Integer.toString(value));
	}

	public static void info(float value) {
		infoInternal(Float.toString(value));
	}

	public static void info(double value) {
		infoInternal(Double.toString(value));
	}

	public static void info(long value) {
		infoInternal(Long.toString(value));
	}

	public static void info(char value) {
		infoInternal(Character.toString(value));
	}

	public static void info(boolean value) {
		infoInternal(Boolean.toString(value));
	}

	public static void info(byte value) {
		infoInternal(Byte.toString(value));
	}

	public static void info(StackTraceElement element) {
		System.out.println(
				element.getClassName() + " Line " + element.getLineNumber() + ": " + element.getMethodName() + "()");
	}

	public static void error(String value) {
		errorInternal(value);
	}

	public static void error(int value) {
		errorInternal(Integer.toString(value));
	}

	public static void error(float value) {
		errorInternal(Float.toString(value));
	}

	public static void error(double value) {
		errorInternal(Double.toString(value));
	}

	public static void error(long value) {
		errorInternal(Long.toString(value));
	}

	public static void error(char value) {
		errorInternal(Character.toString(value));
	}

	public static void error(boolean value) {
		errorInternal(Boolean.toString(value));
	}

	public static void error(byte value) {
		errorInternal(Byte.toString(value));
	}

	public static void error(StackTraceElement element) {
		System.out.println(
				element.getClassName() + " Line " + element.getLineNumber() + ": " + element.getMethodName() + "()");
	}

	public static void error(Exception e) {
		if (e != null) {
			errorInternal(e.toString());
		}
	}

	private static void logInternal(String message) {
		if (message != null) {
			if (!fullLog) {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				if (stack.length > 3) {
					StackTraceElement targetStack = stack[3];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				} else {
					System.out.println(message);
				}
			} else {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for (int i = 0; i < stack.length; i++) {
					StackTraceElement targetStack = stack[i];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				}
			}
		}
	}

	private static void warningInternal(String message) {
		if (message != null) {
			if (!fullLog) {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				if (stack.length > 4) {
					StackTraceElement targetStack = stack[4];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				} else {
					System.out.println(message);
				}
			} else {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for (int i = 0; i < stack.length; i++) {
					StackTraceElement targetStack = stack[i];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				}
			}
		}
	}

	private static void infoInternal(String message) {
		if (message != null) {
			if (!fullLog) {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				if (stack.length > 4) {
					StackTraceElement targetStack = stack[4];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				} else {
					System.out.println(message);
				}
			} else {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for (int i = 0; i < stack.length; i++) {
					StackTraceElement targetStack = stack[i];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				}
			}
		}
	}

	private static void errorInternal(String message) {
		if (message != null) {
			if (!fullLog) {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				if (stack.length > 4) {
					StackTraceElement targetStack = stack[4];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				} else {
					System.out.println(message);
				}
			} else {
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for (int i = 0; i < stack.length; i++) {
					StackTraceElement targetStack = stack[i];
					System.out.println(targetStack.getClassName() + " Line " + targetStack.getLineNumber() + ": "
							+ targetStack.getMethodName() + "(): " + message);
				}
			}
		}
	}
}
