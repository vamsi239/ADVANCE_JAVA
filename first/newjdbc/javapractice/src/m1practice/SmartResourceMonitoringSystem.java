package m1practice;

import java.util.ArrayList;
import java.util.List;

/* ===========================
   Custom Checked Exception
   =========================== */
class ResourceOverloadException extends Exception {
    public ResourceOverloadException(String message) {
        super(message);
    }
}

/* ===========================
   Custom Unchecked Exception
   =========================== */
class CriticalFailureException extends RuntimeException {
    public CriticalFailureException(String message) {
        super(message);
    }
}

/* ===========================
   Full Abstraction
   =========================== */
interface Monitorable {
    double getUsage();
    void checkHealth() throws ResourceOverloadException;
}

/* ===========================
   Partial Abstraction
   =========================== */
abstract class Resource implements Monitorable {

    private double usage; // Encapsulated

    public Resource(double usage) {
        setUsage(usage);
    }

    // Encapsulation with validation
    public void setUsage(double usage) {
        if (usage < 0 || usage > 100) {
            throw new IllegalArgumentException("Usage must be between 0 and 100");
        }
        this.usage = usage;
    }

    @Override
    public double getUsage() {
        return usage;
    }

    // Shared behavior (Partial abstraction)
    protected void logStatus(String resourceName) {
        System.out.println(resourceName + " usage: " + usage + "%");
    }
}

/* ===========================
   CPU Resource
   =========================== */
class CPUResource extends Resource {

    public CPUResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {
        logStatus("CPU");

        if (getUsage() > 85) {
            throw new ResourceOverloadException("CPU Overload Detected!");
        }
        if (getUsage() > 95) {
            throw new CriticalFailureException("CPU Critical Failure!");
        }
    }
}

/* ===========================
   Memory Resource
   =========================== */
class MemoryResource extends Resource {

    public MemoryResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {
        logStatus("Memory");

        if (getUsage() > 80) {
            throw new ResourceOverloadException("Memory Overload Detected!");
        }
    }
}

/* ===========================
   Disk Resource
   =========================== */
class DiskResource extends Resource {

    public DiskResource(double usage) {
        super(usage);
    }

    @Override
    public void checkHealth() throws ResourceOverloadException {
        logStatus("Disk");

        if (getUsage() > 75) {
            throw new ResourceOverloadException("Disk Space Almost Full!");
        }
    }
}

/* ===========================
   Monitoring Engine
   =========================== */
public class SmartResourceMonitoringSystem {

    public static void main(String[] args) {

        List<Monitorable> resources = new ArrayList<>();

        resources.add(new CPUResource(92));
        resources.add(new MemoryResource(78));
        resources.add(new DiskResource(82));

        for (Monitorable resource : resources) {

            try {
                resource.checkHealth();  // Polymorphism
                System.out.println("Status: Healthy\n");

            } catch (ResourceOverloadException e) {
                System.out.println("Warning: " + e.getMessage());
                System.out.println("Attempting Recovery...\n");

            } catch (CriticalFailureException e) {
                System.out.println("CRITICAL: " + e.getMessage());
                System.out.println("System escalation triggered!\n");

            } finally {
                System.out.println("Monitoring cycle completed.\n");
            }
        }

        System.out.println("System Stable. Monitoring continues...");
    }
}