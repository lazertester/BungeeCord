package net.md_5.bungee.event;

public class EventException extends Exception
{

    public EventException(String message)
    {
        super(message);
    }

    public EventException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public EventException(Throwable cause)
    {
        super(cause);
    }
}