/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // Return false if obj is null/undefined or classFunction is not a valid constructor
    if (obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    }

    // Traverse up the prototype chain of obj
    let curr = Object.getPrototypeOf(obj);
    
    while (curr !== null) {
        if (curr === classFunction.prototype) {
            return true;
        }
        curr = Object.getPrototypeOf(curr);
    }

    return false;
};

/**
 * Example usage:
 * checkIfInstanceOf(new Date(), Date); // true
 * checkIfInstanceOf(5, Number);        // true
 * checkIfInstanceOf(Date, Date);      // false
 */
