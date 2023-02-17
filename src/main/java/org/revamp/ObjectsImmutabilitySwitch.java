package org.revamp;

public class ObjectsImmutabilitySwitch {

    /**
     * Write a function that checks reference and throws a {@link NullPointerException} error
     * with custom message.
     *
     * @param obj reference
     *
     * @return boolean
     * @throws NullPointerException given null value
     */
    public boolean isNotNull(Object obj) throws NullPointerException {
        if (obj == null) {
            throw new NullPointerException("Attempted operation on null value." );
        }
        return true;
    }
}
