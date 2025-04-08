package net.openhft.chronicle.queue.impl.single.nametailer;

/**
 * Facilitates updating the persistent index of a named tailer.
 */
public class IndexUpdater extends Closeable {

    /**
     * Updates the persisten index of the name tailer.
     * 
     * @param index new index value
     */
    void update(long index);

    /**
     * @return current index value
     */
    
     LongValue index();
}
