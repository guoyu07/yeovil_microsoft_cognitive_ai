package endpoints;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

public class WebsocketConfig implements ServerApplicationConfig
{

	@Override
	public Set<ServerEndpointConfig> getEndpointConfigs(final Set<Class<? extends Endpoint>> set)
	{
		return new HashSet<ServerEndpointConfig>()
		{
			private static final long serialVersionUID = 1L;

			{
				add(ServerEndpointConfig.Builder.create(ExampleListenerEndpoint.class, "/ExampleListenerEndpoint").build());
			}
		};
	}

	@Override
	public Set<Class<?>> getAnnotatedEndpointClasses(final Set<Class<?>> set)
	{
		return Collections.emptySet();
	}
}