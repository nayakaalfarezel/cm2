public class NodePembeli15 {
    Pembeli15 data;
    NodePembeli15 prev;
    NodePembeli15 next;

    public NodePembeli15(NodePembeli15 prev, Pembeli15 data, NodePembeli15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}