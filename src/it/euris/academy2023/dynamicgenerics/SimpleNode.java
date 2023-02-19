package it.euris.academy2023.dynamicgenerics;

class SimpleNode {
    public Object data;
    public SimpleNode next;

    public SimpleNode(Object data) {
        this.data = data;
        this.next = null;
    }
}