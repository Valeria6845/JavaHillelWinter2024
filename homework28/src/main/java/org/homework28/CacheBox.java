package org.homework28;

import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
@EqualsAndHashCode
public class CacheBox {
    private static final Logger logInfo = LoggerFactory.getLogger("logger.info");
    private static Map<String, Map<String, Object>> cacheMap = new HashMap<>();


    /**
     * Adds the object to the specified cache and assigns the key to it.
     * If specified cache doesn't exist, makes new one.
     */
    public static boolean put(String cache, String key, Object o) {
        if (isCacheExist(cache)) {
            cacheMap.get(cache).put(key, o);
        }else {
            cacheMap.put(cache, new HashMap<>());
            cacheMap.get(cache).put(key, o);
            logInfo.info("Cache '{}' has been created", cache);
        }
        logInfo.info("Object has been added to cache: '{}'", cache);
        return true;
    }

    /**
     * Returns object from specified cache by its key.
     */
    public static Object get(String cache, String key) {
        if(isCacheExist(cache) && cacheMap.get(cache).get(key) != null) {
            Object obj = cacheMap.get(cache).get(key);
            logInfo.info("Object was received from cache '{}' with key '{}'", cache, key);
            return obj;
        }
        return null;
    }

    /**
     * Deletes all caches.
     */
    public static void clear() {
        cacheMap.clear();
        logInfo.info("All caches have been deleted");
    }

    /**
     * Deletes specified cache.
     */
    public static boolean clear(String cache) {
        if (isCacheExist(cache) && !cacheMap.get(cache).isEmpty()) {
            cacheMap.get(cache).clear();
            logInfo.info("Cache '{}' has been deleted", cache);
            return true;
        }
        logInfo.info("Cache is not exist");
        return false;
    }

    /**
     * Returns true if specified cache exists.
     */
    public static boolean isCacheExist(String cache) {
        return cacheMap.get(cache) != null;
    }
}
