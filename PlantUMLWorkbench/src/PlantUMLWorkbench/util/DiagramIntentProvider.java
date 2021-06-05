package PlantUMLWorkbench.util;

import java.util.Collection;

public interface DiagramIntentProvider {
	public Collection<? extends DiagramIntent> getDiagramInfos(DiagramIntentContext context);
}
