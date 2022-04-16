package traces;

import oathkeeper.runtime.EventTracer;
import oathkeeper.runtime.event.OpTriggerEvent;
import oathkeeper.runtime.event.SemanticEvent;

import java.util.List;

public class TraceForEventProtectedByEventTemplate extends TraceForTemplate{

    //2 protectedby 1
    public EventTracer getPatchedEventTracer()
    {
        EventTracer tracer = new EventTracer();
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("4"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.assignSerialTimestamp(true,true);

        return tracer;
    }

    public EventTracer getUnpatchedEventTracer()
    {
        EventTracer tracer = new EventTracer();
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("4"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("3"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.enqueue(new OpTriggerEvent("1"));
        tracer.enqueue(new OpTriggerEvent("2"));
        tracer.assignSerialTimestamp(true,true);

        return tracer;
    }

}
